CREATE TABLE LITHOLOGY (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  hole_id varchar(20) not null,
  rock_name varchar(20) not null,
  depth_from decimal(6,2) not null,
  depth_to decimal(6,2) not null,
  foreign key (hole_id) references collar (id)
)