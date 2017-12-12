
insert into MEAL(id, name, invented) values (1,'meal_1', {ts '2017-12-09 07:52.69'});
insert into MEAL(id, name, invented) values (2,'meal_2', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (3,'meal_3', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (4,'meal_4', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (5,'meal_5', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (6,'meal_6', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (7,'meal_7', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (8,'meal_8', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (9,'meal_9', {ts '2017-12-09 08:47:52.69'});
insert into MEAL(id, name, invented) values (10,'meal_10', {ts '2017-12-09 08:47:52.69'});


insert into HOUSE(id, address, zip_code,house_type) values (1,'Stuttgart','70190','FLAT');
insert into HOUSE(id, address, zip_code,house_type) values (2,'Munich','70180','HOUSE');
insert into HOUSE(id, address, zip_code,house_type) values (3,'Berlin','70130','HOUSE');
insert into HOUSE(id, address, zip_code,house_type) values (4,'Hamburg','70140','ESTATE');
insert into HOUSE(id, address, zip_code,house_type) values (5,'Frankfurt','70150','ESTATE');

insert into PERSON(id, name, age,house_id) values (1,'Martin',29,1);
insert into PERSON(id, name, age,house_id) values (2,'Christoffer',32,2);
insert into PERSON(id, name, age,house_id) values (3,'Sabah',35,3);
insert into PERSON(id, name, age,house_id) values (4,'Siamak',27,4);
insert into PERSON(id, name, age,house_id) values (5,'Bijan',19,5);

insert into CHILD(id, name,sex, age,parent_id,hair_color,bi_cycle_color) values (1,'Arzhin','MALE',5,5,'','BLUE');
insert into CHILD(id, name,sex, age,parent_id,hair_color,bi_cycle_color) values (2,'Arian','MALE',10,5,'','Green');
insert into CHILD(id, name,sex, age,parent_id,hair_color,bi_cycle_color) values (3,'Anne','FEMALE',12,2,'RED','');
insert into CHILD(id, name,sex, age,parent_id,hair_color,bi_cycle_color) values (4,'Viana','FEMALE',7,,'PINK','');


insert into CHILD_MEALS(child_id, meal_id) values (1,1);
insert into CHILD_MEALS(child_id, meal_id) values (1,2);
insert into CHILD_MEALS(child_id, meal_id) values (1,3);
insert into CHILD_MEALS(child_id, meal_id) values (2,1);
insert into CHILD_MEALS(child_id, meal_id) values (2,4);
insert into CHILD_MEALS(child_id, meal_id) values (2,5);
insert into CHILD_MEALS(child_id, meal_id) values (3,5);
insert into CHILD_MEALS(child_id, meal_id) values (3,6);
insert into CHILD_MEALS(child_id, meal_id) values (4,6);
insert into CHILD_MEALS(child_id, meal_id) values (4,7);
insert into CHILD_MEALS(child_id, meal_id) values (5,8);

