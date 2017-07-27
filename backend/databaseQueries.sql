drop table if exists `libraries`;
create table `libraries`
(
`id` int unsigned not null auto_increment,
`name` varchar(200)not null,
`zipCode` varchar(200)not null,
`neighborhood` varchar(200)not null,
`councilDistrict` varchar(200)not null,
`policeDistrict` varchar(200)not null,
`location1` varchar(200)not null,
constraint pk_libraries_id primary key(`id`)
);
