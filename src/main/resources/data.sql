insert into PRODUCT(id, name) values (1, 'my product 1');
insert into PRODUCT(id, name) values (2, 'my product 2');

insert into IMAGE(id, name) values(1, 'image 1');
insert into IMAGE(id, name) values(2, 'image 2');
insert into IMAGE(id, name) values(3, 'image 3');

insert into PRODUCT_IMAGES(product_id, images_id) values(1, 1);
insert into PRODUCT_IMAGES(product_id, images_id) values(1, 2);
insert into PRODUCT_IMAGES(product_id, images_id) values(2, 2);
insert into PRODUCT_IMAGES(product_id, images_id) values(2, 3);

