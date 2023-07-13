CREATE TABLE tasks (
  taskId int unsigned AUTO_INCREMENT,
  taskName VARCHAR(100) NOT NULL,
  revieweeResultId int,
  reviewerResultId int,
  PRIMARY KEY(taskId)
);

INSERT INTO tasks(taskName, revieweeResultId, reviewerResultId) VALUES ("7/7 1本目", 1, 1);
INSERT INTO tasks(taskName, revieweeResultId, reviewerResultId) VALUES ("7/7 2本目", 2, 2);
INSERT INTO tasks(taskName, revieweeResultId, reviewerResultId) VALUES ("7/7 3本目", 3, 3);
