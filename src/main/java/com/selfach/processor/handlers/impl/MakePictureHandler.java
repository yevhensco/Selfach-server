package com.selfach.processor.handlers.impl;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.selfach.dao.CamerasDao;
import com.selfach.dao.PhotoDao;
import com.selfach.dao.jooq.tables.records.CameraRecord;
import com.selfach.dao.jooq.tables.records.PhotoRecord;
import com.selfach.enums.Resolution;
import com.selfach.exceptions.AndroidServerException;
import com.selfach.processor.handlers.GeneralHandler;
import com.selfach.processor.handlers.Response;
import com.selfach.service.PictureCompressor;
import com.selfach.service.SnapShotter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * By gekoreed on 9/26/15.
 */
@Component("makePicture")
public class MakePictureHandler implements GeneralHandler<MakePictureHandler.MakerResponse>{

    @Autowired
    CamerasDao camerasDao;

    @Autowired
    SnapShotter snapShotter;

    @Autowired
    PictureCompressor compressor;

    @Autowired
    PhotoDao photoDao;

    @Override
    public MakerResponse handle(ObjectNode node) throws Exception {

        int userId = node.get("userId").asInt();
        int cameraId = node.get("cameraId").asInt();

        CameraRecord cameraById = camerasDao.getCameraById(cameraId);

        if (cameraById == null)
            throw new AndroidServerException("CameraNotFound");

        long time = System.currentTimeMillis();
        String imageName = userId + "-" + time +"-";
        boolean done = snapShotter.makeImage(imageName, cameraById.getUrl(), Resolution.ORIGINAL);

        compressor.resizeImage(new File("pictures/"+imageName+".jpg"));

        if (!done){
            throw new AndroidServerException("Something wrong with Server");
        }

        PhotoRecord photoRecord = new PhotoRecord();
        photoRecord.setCreated(String.valueOf(time));
        photoRecord.setUserid(userId);
        photoRecord.setCameraid(cameraId);
        photoRecord.setFormat("jpg");
        photoDao.savePhoto(photoRecord);

        MakerResponse response = new MakerResponse();

        response.fileName = imageName;
        response.format = "jpg";
        return response;
    }


    public class MakerResponse extends Response {
        public String fileName;
        public String format;
    }
}
