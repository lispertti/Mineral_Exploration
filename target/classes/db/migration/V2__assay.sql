CREATE TABLE ASSAY (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  hole_id varchar(20) not null,
  sample_id varchar(20) not null,
  depth_from decimal(6,2) not null,
  depth_to decimal(6,2) not null,
  Au_ppm decimal(5,2),
  As_ppm decimal(5,2),
  foreign key (hole_id) references collar (id)
)