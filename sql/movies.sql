CREATE TABLE IF NOT EXISTS movie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    release_year INT NOT NULL,
    genre VARCHAR(255),
    director VARCHAR(255),
    average_rating DECIMAL(3, 1) DEFAULT 0.0
);