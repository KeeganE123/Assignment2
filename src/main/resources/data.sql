INSERT INTO password_record (id,title, username, password, url, email, notes) VALUES
(FLOOR (RAND() * 900000000) + 100000000, 'Facebook', 'user1', 'pass123', 'https://facebook.com', 'user1@example.com', 'Personal account'),
(FLOOR(RAND() * 900000000) + 100000000,'Gmail', 'user2', 'securepass', 'https://mail.google.com', 'user2@example.com', 'Work email'),
(FLOOR(RAND() * 900000000) + 100000000,'Twitter', 'user3', 'tweetpass', 'https://twitter.com', 'user3@example.com', 'Social media'),
(FLOOR(RAND() * 900000000) + 100000000,'GitHub', 'user4', 'gitsecure', 'https://github.com', 'user4@example.com', 'Development account'),
(FLOOR(RAND() * 900000000) + 100000000,'LinkedIn', 'user5', 'linkedinpass', 'https://linkedin.com', 'user5@example.com', 'Professional network');