# EventManagementApp


#Database: 
  bookthatshowdatabase
Tables:
  theatre
  movies
  screen
  show
  seat
  ticket
  user


#Populating data:
INSERT INTO public.ticket(
	id, transaction_id, seat_id, row_number,user_id)
	VALUES 
	(1,1,13,1,3),
  (2,1,14,1,3),
  (3,2,15,1,2),
  (4,2,16,1,2),
  (5,3,17,1,5),
  (6,3,18,1,5),
  (7,4,5,1,1),
  (8,4,6,1,1),
  (9,4,7,1,1),
  (10,4,8,1,1),
  (11,4,9,1,1),
  (12,5,1,1,3),
  (13,5,2,1,3),
  (14,5,3,1,3),
  (15,5,4,1,3),
  (16,6,23,1,2),
  (17,6,24,1,2),
  (18,6,25,1,2),
  (19,6,26,1,2),
  (20,7,19,1,1),
  (21,8,10,1,5),
  (22,8,11,1,5),
  (23,8,12,1,5),
  (24,9,27,1,1),
  (25,9,28,1,1),
  (26,10,20,1,5),
  (27,11,21,1,3),
  (28,12,22,1,2),
  (29,13,29,1,1),
  (30,13,30,1,1),
  (31,13,31,1,1),
  (32,14,37,1,3),
  (33,14,38,1,3),
  (34,15,35,1,1),
  (35,15,36,1,1),
  (36,16,32,1,4),
  (37,16,33,1,4),
  (38,16,34,1,4),
  (39,17,50,1,1),
  (40,18,39,1,2),
  (41,18,40,1,2),
  (42,19,44,1,5),
  (43,20,41,1,4),
  (44,20,42,1,4),
  (45,20,43,1,4),
  (46,20,45,1,4),
  (47,20,46,1,4),
  (48,20,47,1,4),
  (49,20,48,1,4),
  (50,20,49,1,4);
  
  
INSERT INTO public.user_data(
	id, name)
	VALUES 
	(1,'John Doe'),
	(2,'Jane Doe'),
	(3,'John Wick'),
	(4,'Donald Trump'),
	(5,'Narendra Modi');

INSERT INTO public.seat(
	id, show_id,  seat_number,  row_number, booked)
	VALUES 
	(1,1,1,1,'No'),
	(2,2,2,1,'No'),
	(3,3,3,1,'No'),
	(4,4,4,1,'No'),
	(5,5,5,1,'No'),
	(6,6,1,1,'No'),
	(7,7,2,1,'No'),
	(8,8,3,1,'No'),
	(9,9,4,1,'No'),
	(10,10,5,1,'No'),
	(11,11,1,1,'No'),
	(12,12,2,1,'No'),
	(13,13,3,1,'No'),
	(14,14,4,1,'No'),
	(15,15,5,1,'No'),
	(16,16,1,1,'No'),
	(17,17,2,1,'No'),
	(18,18,3,1,'No'),
	(19,19,4,1,'No'),
	(20,20,5,1,'No'),
	(21,21,1,1,'No'),
	(22,22,2,1,'No'),
	(23,23,3,1,'No'),
	(24,24,4,1,'No'),
	(25,25,5,1,'No'),
	(26,26,1,1,'No'),
	(27,27,2,1,'No'),
	(28,28,3,1,'No'),
	(29,29,4,1,'No'),
	(30,30,5,1,'No'),
	(31,31,1,1,'No'),
	(32,32,2,1,'No'),
	(33,33,3,1,'No'),
	(34,34,4,1,'No'),
	(35,35,5,1,'No'),
	(36,36,1,1,'No'),
	(37,37,2,1,'No'),
	(38,38,3,1,'No'),
	(39,39,4,1,'No'),
	(40,40,5,1,'No'),
	(41,41,1,1,'No'),
	(42,42,2,1,'No'),
	(43,43,3,1,'No'),
	(44,44,4,1,'No'),
	(45,45,5,1,'No'),
	(46,46,1,1,'No'),
	(47,47,2,1,'No'),
	(48,48,3,1,'No'),
	(49,49,4,1,'No'),
	(50,50,5,1,'No'),
	(51,1,6,1,'No'),
	(52,2,7,1,'No'),
	(53,3,8,1,'No'),
	(54,4,9,1,'No'),
	(55,5,10,1,'No'),
	(56,6,6,1,'No'),
	(57,7,7,1,'No'),
	(58,8,8,1,'No'),
	(59,9,9,1,'No'),
	(60,10,10,1,'No'),
	(61,11,11,1,'No'),
	(62,12,12,1,'No'),
	(63,13,13,1,'No'),
	(64,14,14,1,'No'),
	(65,15,15,1,'No'),
	(66,16,10,1,'No'),
	(67,17,11,1,'No'),
	(68,18,12,1,'No'),
	(69,19,13,1,'No'),
	(70,20,14,1,'No'),
	(71,21,15,1,'No'),
	(72,22,11,1,'No'),
	(73,23,12,1,'No'),
	(74,24,13,1,'No'),
	(75,25,14,1,'No'),
	(76,26,15,1,'No'),
	(77,27,16,1,'No'),
	(78,28,17,1,'No'),
	(79,29,18,1,'No'),
	(80,30,19,1,'No'),
	(81,31,20,1,'No'),
	(82,32,11,1,'No'),
	(83,33,6,1,'No'),
	(84,34,16,1,'No'),
	(85,35,17,1,'No'),
	(86,36,18,1,'No'),
	(87,37,19,1,'No'),
	(88,38,20,1,'No'),
	(89,39,7,1,'No'),
	(90,40,9,1,'No'),
	(91,41,13,1,'No'),
	(92,42,14,1,'No'),
	(93,43,15,1,'No'),
	(94,44,16,1,'No'),
	(95,45,17,1,'No'),
	(96,46,18,1,'No'),
	(97,47,19,1,'No'),
	(98,48,20,1,'No'),
	(99,49,21,1,'No'),
	(100,50,22,1,'No');

INSERT INTO public.show(
	id, screen_id, movie_id, start_time)
	VALUES 
	(1,1,3,'12:00'),
	(2,1,1,'15:30'),
	(3,2,4,'18:00'),
	(4,3,11,'12:00'),
	(5,4,2,'21:00'),
	(6,4,5,'15:30'),
	(7,4,10,'00:00'),
	(8,5,5,'12:00'),
	(9,6,11,'00:00'),
	(10,7,5,'15:30'),
	(11,8,8,'09:30'),
	(12,7,3,'00:00'),
	(13,6,12,'18:00'),
	(14,5,12,'00:00'),
	(15,7,12,'21:00'),
	(16,6,12,'15:30'),
	(17,1,3,'12:00'),
	(18,2,4,'09:30'),
	(19,3,1,'15:30'),
	(20,4,2,'00:00'),
	(21,3,5,'21:00'),
	(22,8,13,'00:00'),
	(23,4,1,'15:30'),
	(24,6,7,'18:00'),
	(25,0,4,'12:00'),
	(26,10,2,'21:00'),
	(27,11,12,'18:00'),
	(28,10,7,'15:30'),
	(29,10,4,'18:00'),
	(30,11,9,'12:00'),
	(31,10,11,'09:30'),
	(32,4,8,'18:00'),
	(33,5,2,'18:00'),
	(34,9,13,'09:30'),
	(35,2,13,'21:00'),
	(36,6,1,'15:30'),
	(37,3,13,'09:30'),
	(38,9,3,'09:30'),
	(39,1,5,'18:00'),
	(40,5,1,'09:30'),
	(41,7,12,'12:00'),
	(42,3,5,'15:30'),
	(43,8,7,'21:00'),
	(44,10,3,'21:00'),
	(45,11,1,'18:00'),
	(46,3,6,'21:00'),
	(47,11,11,'18:00'),
	(48,4,3,'15:30'),
	(49,5,6,'15:30'),
	(50,1,3,'00:00');
  
INSERT INTO public.screen(
	id, number_of_seats, theatre_id)
	VALUES 
	(1,100,1),
	(2,80,1),
	(3,90,1),
	(4,120,1),
	(5,80,1),
	(6,80,2),
	(7,70,2),
	(8,55,2),
	(9,50,2),
	(10,200,3),
	(11,100,3),
	(12,100,3),
	(13,100,3),
	(14,150,4),
	(15,100,4),
	(16,50,4),
	(17,120,4),
	(18,60,4),
	(19,20,4),
	(20,35,4),
	(21,70,5),
	(22,40,5),
	(23,30,5),
	(24,100,5),
	(25,90,5),
	(26,80,6),
	(27,70,6),
	(28,60,6),
	(29,50,6),
	(30,60,6),
	(31,65,6),
	(32,45,7),
	(33,75,7),
	(34,125,7),
	(35,90,7),
	(36,65,7),
	(37,75,7),
	(38,30,7),
	(39,85,7),
	(40,90,9),
	(41,100,9),
	(42,120,9),
	(43,150,9),
	(44,20,10),
	(45,50,10),
	(46,30,10),
	(47,200,11),
	(48,20,11),
	(49,200,11),
	(50,100,11),
	(51,200,12),
	(52,150,12);
INSERT INTO public.theatre(
	id, name, address, number_of_screens, rating, image)
	VALUES 
	(1,'PVR','Nagar Road, Viman Nagar',5,4.3,'https://images.newindianexpress.com/'),
	(2,'CityPrideKothrud','Kothrud',4,4.5,'https://images.newindianexpress.com/'),
	(3,'CityPrideSataraRoad','Satara Road',4,3.9,'https://images.newindianexpress.com/'),
	(4,'CityPrideAbhiruchi','Sinhagad Road',7,4.2,'https://images.newindianexpress.com/'),
	(5,'Inox','Bund Garden Road',5,3.6,'https://images.newindianexpress.com/'),
	(6,'Esquare','University Road',6,4.1,'https://images.newindianexpress.com/'),
	(7,'Cinepolis','Magarpatta',8,2.5,'https://images.newindianexpress.com/'),
	(8,'BigCinemas','Kalyani Nagar',4,3.7,'https://images.newindianexpress.com/'),
	(9,'AMCEntertainment','Suncity Road',3,3.6,'https://images.newindianexpress.com/'),
	(10,'Carnival','Mumbai-Pune Road',4,4.8,'https://images.newindianexpress.com/'),
	(11,'Funtime','Vadgaon',2,1.7,'https://images.newindianexpress.com/');

INSERT INTO public.movies(
	id, title, director, lead1, lead2, duration, genre, rating, image)
	VALUES 
	(1,'Avatar','James Cameron','CCH Pounder','Joel David Moore',1.58,'Action|Adventure|Fantasy|Sci-Fi',7.9,'https://cdn.shopify.com/'),	
	(2,'Pirates of the Caribbean: At World''s End','Gore Verbinski','Johnny Depp','Orlando Bloom',2.35,'Action|Adventure|Fantasy',7.1,'https://cdn.shopify.com/'),
	(3,'Spectre','Sam Mendes','Christoph Waltz','Rory Kinnear',2.35,'Action|Adventure|Thriller',6.8,'https://cdn.shopify.com/s/'),
	(4,'The Dark Knight Rises','Christopher Nolan','Tom Hardy','Christian Bale',2.35,'Action|Thriller',8.5,'https://cdn.shopify.com/s/'),
	(5,'Star Wars: Episode VII - The Force Awakens','Doug Walker','Doug Walker','Rob Walker',1.55,'Documentary',7.1,'https://cdn.shopify.com/s/'),
	(6,'John Carter','Andrew Stanton','Daryl Sabara','Samantha Morton',2.35,'Action|Adventure|Sci-Fi',6.6,'https://cdn.shopify.com/s/'),
	(7,'Spider-Man 3','Sam Raimi','J.K. Simmons','James Franco',2.35,'Action|Adventure|Romance',6.2,'https://cdn.shopify.com/s/files'),
	(8,'Tangled','Nathan Greno','Brad Garrett','Donna Murphy',2.07,'Adventure|Animation|Comedy|Family|Fantasy|Musical|Romance',7.8,'https://cdn.shopify.com/s/'),
	(9,'Avengers: Age of Ultron','Joss Whedon','Chris Hemsworth','Robert Downey Jr.',2.35,'Action|Adventure|Sci-Fi',7.5,'https://cdn.shopify.com/s'),
	(10,'Harry Potter and the Half-Blood Prince','David Yates','Alan Rickman','Daniel Radcliffe',2.35,'Adventure|Family|Fantasy|Mystery',7.5,'https://cdn.shopify.com/s/'),
	(11,'Batman v Superman: Dawn of Justice','Zack Snyder','Henry Cavill','Lauren Cohan',2.35,'Action|Adventure|Sci-Fi',6.9,'https://cdn.shopify.com/s/files/1/1416/8662'),
	(12,'Superman Returns','Bryan Singer','Kevin Spacey','Marlon Brando',2.35,'Action|Adventure|Sci-Fi',6.1,'https://cdn.shopify.com/s/files/'),
	(13,'Quantum of Solace','Marc Forster','Giancarlo Giannini','Mathieu Amalric',2.35,'Action|Adventure',6.7,'https://cdn.shopify.com');


