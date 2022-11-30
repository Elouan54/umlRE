INSERT INTO `utilisateur` (`id`, `nom`, `prenom`) VALUES
(1, 'Smith', 'Ed'),
(2, 'Wesson', 'Turner'),
(3, 'Jeanson', 'Elouan'),
(4, 'Swich', 'Aurel');

INSERT INTO `ressource` (`id`, `langue`, `titre`, `utilisateur_id`) VALUES
(1, 'français', 'TitleImage', 1),
(2, 'anglais', 'TitleVideo', 3),
(3, 'anglais', 'TitleText', 2),
(4, 'anglais', 'TitleText2', 3);

INSERT INTO `image` (`url`, `id`) VALUES
('http://image.fr', '1');

INSERT INTO `video` (`sous_titre`, `url_video`, `id`) VALUES
('bla bla bla', 'http://video.com', '2');

INSERT INTO `texte` (`taille`, `id`) VALUES
('200ko', '3'),
('2Mo', '4');

INSERT INTO `commentaire` (`id`, `commentaire`, `datetime`, `ressource_id`, `utilisateur_id`) VALUES
(1, 'Très beau post !', '2022-11-29 15:24:06', 2, 3),
(2, 'wow', '2022-11-17 09:36:06', 4, 1);

INSERT INTO `relation` (`id`, `type`, `utilisateur1_id`, `utilisateur2_id`) VALUES
(1, 'amis', 3, 1),
(2, 'famille', 1, 2),
(3, 'collègue', 4, 3);