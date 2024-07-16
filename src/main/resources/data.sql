INSERT INTO user (name, email, phone, address, bio) VALUES 
('Raj Soma', 'somaraj@gmail.com', '123-456-7890', '123 Main St, Anytown, USA',  'developer with 10 years of experience.'),
('Raj Kumar', 'rajk@yahoo.com', '987-654-3210', '456 Elm St, Othertown, USA', 'Coder with 5 years of experience.');

INSERT INTO education (institution, degree, major, startDate, endDate, user_id) VALUES 
('University of Texas', 'Bachelor of Computer Engineering', 'Electronics', '2005-09-01', '2009-06-01', 1),
('California  Technology', 'Master of Science', 'Data Management', '2010-09-01', '2012-06-01', 1);

INSERT INTO experience (company, position, start_date, end_date, description, user_id) VALUES 
('Google', 'Software Developer', '2012-07-01', '2016-12-01', 'Design and Develop an application', 1),
('Yahoo', 'Senior Developer', '2017-01-01', '2020-12-01', 'Led a team of Junior Developers.', 1);


