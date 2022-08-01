UPDATE `dollarsbank`.`checking_accounts`
SET
`username` = <{username: }>,
`name` = <{name: }>,
`accountNum` = <{accountNum: }>,
`ssn` = <{ssn: }>,
`balance` = <{balance: }>,
WHERE `username` = <{expr}>;
