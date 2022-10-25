CREATE TABLE ALTERATION (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  hole_id varchar(20) not null,
  depth_from decimal(6,2) not null,
  depth_to decimal(6,2) not null,
  bleaching int check (bleaching between 1 and 5),
  veining int check (veining between 1 and 5),
  sulphides int check (sulphides between 1 and 5),
  foreign key (hole_id) references collar (id)
)