/**
 * This class is generated by jOOQ
 */
package com.pokupaka.dao.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.5" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Camera extends org.jooq.impl.TableImpl<com.pokupaka.dao.jooq.tables.records.CameraRecord> {

	private static final long serialVersionUID = -2061338640;

	/**
	 * The singleton instance of <code>pokupaka.Camera</code>
	 */
	public static final com.pokupaka.dao.jooq.tables.Camera CAMERA = new com.pokupaka.dao.jooq.tables.Camera();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.pokupaka.dao.jooq.tables.records.CameraRecord> getRecordType() {
		return com.pokupaka.dao.jooq.tables.records.CameraRecord.class;
	}

	/**
	 * The column <code>pokupaka.Camera.id</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pokupaka.Camera.name</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(22).defaulted(true), this, "");

	/**
	 * The column <code>pokupaka.Camera.url</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(55).nullable(false), this, "");

	/**
	 * The column <code>pokupaka.Camera.longitude</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.String> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.VARCHAR.length(22).nullable(false), this, "");

	/**
	 * The column <code>pokupaka.Camera.latitude</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.String> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.VARCHAR.length(22).nullable(false), this, "");

	/**
	 * The column <code>pokupaka.Camera.angle</code>.
	 */
	public final org.jooq.TableField<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.Integer> ANGLE = createField("angle", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * Create a <code>pokupaka.Camera</code> table reference
	 */
	public Camera() {
		this("Camera", null);
	}

	/**
	 * Create an aliased <code>pokupaka.Camera</code> table reference
	 */
	public Camera(java.lang.String alias) {
		this(alias, com.pokupaka.dao.jooq.tables.Camera.CAMERA);
	}

	private Camera(java.lang.String alias, org.jooq.Table<com.pokupaka.dao.jooq.tables.records.CameraRecord> aliased) {
		this(alias, aliased, null);
	}

	private Camera(java.lang.String alias, org.jooq.Table<com.pokupaka.dao.jooq.tables.records.CameraRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.pokupaka.dao.jooq.Pokupaka.POKUPAKA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.pokupaka.dao.jooq.tables.records.CameraRecord, java.lang.Integer> getIdentity() {
		return com.pokupaka.dao.jooq.Keys.IDENTITY_CAMERA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.pokupaka.dao.jooq.tables.records.CameraRecord> getPrimaryKey() {
		return com.pokupaka.dao.jooq.Keys.KEY_CAMERA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.pokupaka.dao.jooq.tables.records.CameraRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.pokupaka.dao.jooq.tables.records.CameraRecord>>asList(com.pokupaka.dao.jooq.Keys.KEY_CAMERA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.pokupaka.dao.jooq.tables.Camera as(java.lang.String alias) {
		return new com.pokupaka.dao.jooq.tables.Camera(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.pokupaka.dao.jooq.tables.Camera rename(java.lang.String name) {
		return new com.pokupaka.dao.jooq.tables.Camera(name, null);
	}
}
