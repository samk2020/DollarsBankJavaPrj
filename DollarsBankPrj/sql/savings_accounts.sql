REATE TABLE `savings_accounts` (
  `username` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `AccountNum` int NOT NULL,
  `ssn` int NOT NULL,
  `balance` double NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci