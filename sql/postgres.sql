create table cat (
     uid serial PRIMARY KEY,
     name varchar(30) not null,
     age integer,
     eyes_color varchar(20),
     fur_color varchar(20),
     breed varchar(30),
     owner_name varchar(30)
);

insert into cat (name, age, eyes_color, fur_color, breed, owner_name) VALUES ('Vasya', 12, 'green', 'gray stripped', 'none', 'Ira');
insert into cat (name, age, eyes_color, fur_color, breed, owner_name) VALUES ('Murzik', 16, 'green', 'gray stripped', 'Siamese', 'Ira');
insert into cat (name, age, eyes_color, fur_color, breed, owner_name) VALUES ('Pushok', 10, 'green', 'gray and White', 'none', 'Irina');
insert into cat (name, age, eyes_color, fur_color, breed, owner_name) VALUES ('Ksusha', 7, 'green', 'tortoiseshell', 'none', 'Maria');
insert into cat (name, age, eyes_color, fur_color, breed, owner_name) VALUES ('Katia', 5, 'green', 'gray stripped', 'Maine Coon', 'Maria');

