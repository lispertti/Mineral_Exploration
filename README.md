# Mineral_Exploration
#Drilling Data Database


#This project has been created from a template for a project work of Databases and Open Interfaces course (Vaasa University).

#The databse is created for mineral exploration or mining project and it's main users are geologists, geotechinicians and mining engineers.

#There is one parent table in the database which includes location information of each drill hole (collar). Other tables are child tables which all are related to
#the collar table. Other tables are 1) lithology, 2) assay, 3) alteration.

#Application is using SQLLite, thus all SQL-statements (CREATE TABLE, ALTER TABLE) must be defined using SQLite dialect, which is
#a little different than MySQL-dialect. (use existing tables as a reference). Link to SQL-reference: https://www.sqlite.org/lang_createtable.html
