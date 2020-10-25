insert into categories
values(1, 'milk', 'Milk with Vitamin D is made from the highest quality milk using modern ultra-high temperature (UHT) processing technology, which removes bacteria from milk and retains all the beneficial components (calcium, protein, vitamins and other minerals).'),
(2,'cheese', 'Goat cheese is a semi-hard cheese made from goat milk, aged for 5 weeks. Among goats cheeses, Chevrette cheese is distinguished by its delicate flavor, moderate salinity and lightness.'),
(3,'yogurt', 'Thick Yogurt is Traditional 3.3% is a natural live yoghurt, in which all the beneficial lactobacilli have been preserved. Contains only two ingredients: milk and yoghurt starter culture, does not contain preservatives or artificial additives.'),
(4,'ice cream', 'Ice cream vanilla is ice cream covered with glaze.
Ingredients: skimmed milk, cocoa butter, cocoa mass, sugar, glucose syrup, cream, whey powder, milk fat, skimmed milk powder');



insert into products
values
(1,'1,5%', 1, 250, 'dfddfdff',2, '2020-10-13','2020-11-13', 1, 000111222),
(2, '2.5%', 1,300,'uiuiuiui',1,'2020-10-14','2020-11-14', 1, 111222333),
(3, '3.2%', 1, 350, 'ghghgghg', 3,'2020-10-15','2020-11-15', 1, 22233344),
(4, 'cheddar', 2, 3000, 'gioooio', 1, '2020-10-16', '2020-12-16', 1, 444555666),
(5, 'parmesan', 2, 4000, 'hjhjjhj', 2, '2020-10-17', '2020-12-17', 1, 555666777),
(6, 'mozarrella', 2, 4500, 'jkjkjk', 3, '2020-10-18', '2020-12-18', 1, 666777888),
(7, 'mango', 3, 150, 'iuiuuiui',1,'2020-10-19','2020-12-19', 0.2, 777888999),
(8, 'strawberry',3, 150, 'hghghghg',3,'2020-10-20','2020-12-20', 0.2, 888999111),
(9, 'blueberry',3, 150, 'jkjijijii',2,'2020-10-21','2020-12-21', 0.2, 999111222),
(10, 'chocolate',4, 200, 'bjjbjbjj',2,'2020-10-22', '2020-12-22', 0.15, 999111111),
(11, 'vanilla',4, 200, 'hjhjhjhj',3,'2020-10-23', '2020-12-23', 0.15, 999111111),
(12, 'banana',4, 200, 'hjhjhjhj',1, '2020-10-24', '2020-12-24', 0.15, 999111111);


insert into customer(customer_id, customer_name, customer_email, customer_phone, payment_id)
values(111, 'Jerry Traynor', 'jerry123@bk.ru', '8734562783', '111111'),
(112, 'Steve Melwood', 'stevemelwood@mail.ru', '8745274621', '111112'),
(113, 'Cree Chicino', 'creeiscree@gmail.com', '8349274937', '111113'),
(114, 'Dwayne Johnson', 'therock@gmail.com', '8374388483', '111114'),
(115, 'Daniyal Ganiuly', 'd.ganiuly@bk.ru', '8782477353', '111115');