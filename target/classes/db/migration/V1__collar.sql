CREATE TABLE COLLAR (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  hole_id varchar(20) not null,
  easting decimal(8,2) not null,
  northing decimal(9,2) not null,
  elevation decimal(6,2),
  max_depth_metres decimal(6,2),
  dip int not null,
  direction int not null
)