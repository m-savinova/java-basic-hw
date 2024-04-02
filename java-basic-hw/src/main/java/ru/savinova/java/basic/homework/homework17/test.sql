CREATE TABLE questions (
	id serial4 NOT NULL,
	question varchar NOT NULL,
	name_test varchar NOT NULL,
	CONSTRAINT questions_pk PRIMARY KEY (id),
	CONSTRAINT questions_unique UNIQUE (id)
);

CREATE TABLE answers (
	answer varchar NOT NULL,
	id_question int4 NOT NULL,
	correct_answer _bool NULL
);

INSERT INTO questions (id, question, name_test) VALUES(1, 'Бактерии возникли… ?', 'Биология');
INSERT INTO questions (id, question, name_test) VALUES(2, 'Бактерии образуют споры, чтобы…? ', 'Биология');
INSERT INTO questions (id, question, name_test) VALUES(3, 'В отличие от растений, животных и грибов у клеток бактерий:', 'Биология');
INSERT INTO questions (id, question, name_test) VALUES(4, 'Бактерии в форме шариков называются:', 'Биология');
INSERT INTO questions (id, question, name_test) VALUES(5, '2+2', 'Математика');

INSERT INTO answers (id_question, answer, correct_answer) VALUES(2, 'Перемещаться на большие расстояния.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(2, 'Активнее заражать другие организмы.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(2, 'Размножаться.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(1, 'Сразу после Большого Взрыва.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(1, 'Сразу при формировании Земли.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(3, 'Есть клеточная стенка.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(3, 'Нет цитоплазмы.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(3, 'Нет наследственной информации (ДНК, ядерного вещества).', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(4, 'Бациллы.', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(1, 'Около 4,0 - 3,5 млрд. лет назад.', '{true}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(2, 'Переждать неблагоприятные условия.', '{true}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(3, 'Нет ядра.', '{true}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(4, 'Кокки.', '{true}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(5, '4', '{true}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(5, '1', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(5, '0', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(5, '4687', '{false}');
INSERT INTO answers (id_question, answer, correct_answer) VALUES(5, '3,99', '{false}');