

INSERT INTO mackerelcmslike_db.user (mail, firstname, lastname, password) VALUES  ('admin@admin.admin', 'Julien', 'canse', '$2a$10$mxnYizNJvB0SOLk8iUj50OUXcBLXNUft0z8oud35KzWi29E4z7IMq');


INSERT INTO mackerelcmslike_db.header (page_select1, page_select2, page_select3, page_select4, page_select5,page_select6,btn1,btn2,bg_Select1, bg_Select2, bg_Select3, bg_Select4, bg_Select5, bg_Select6) VALUES  ('Home','Club','Event','Festival','Artistes','Contact','LE FESTIVAL', 'BILLETERIE','bg-mack-fest.png' ,'club-bg-header.png' ,'event-bg-header.jpg' ,'festival-bg-header.jpg' ,'artiste-bg-header.png' ,'contact-bg-header.jpg');
INSERT INTO mackerelcmslike_db.home (auteur, message,titre) VALUES  ('- J.J.J.','"Il reste toujours un ou deux thons en fin de soirée."','L ASSOCIATION MACKEREL CLUB');
INSERT INTO mackerelcmslike_db.home_article (titre, message,btn,img) VALUES  ('Dans le Grand Est','Ne ratez rien ! Venez découvrir nos rendez-vous de type bagarre','ÉVÉNEMENTS','home-grand-est.jpg'),
                                                                            ('Nos bagareurs ','Une équipe de bras cassés pour vous servir et toujours prêt à péter des tibias.','ÉQUIPE','home-bagatte.jpg');

INSERT INTO mackerelcmslike_db.home_article_list (home_id, article_list_id) VALUES (1,1),(1,2);

INSERT INTO mackerelcmslike_db.home_section_bottom (btn, title, img) VALUES  ('BESOIN D UNE INFO ?','CONTACT','poisson-home-gottom.png');
INSERT INTO mackerelcmslike_db.home_home_section_bottoms(home_id, home_section_bottoms_id) VALUES (1,1);

INSERT INTO mackerelcmslike_db.footer (picto1,link_picto1,picto2,link_picto2 ,picto3,link_picto3 ,picto4,link_picto4 ,txt_info1 ,txt_info2) VALUES ('icons-facebook.svg','https://www.facebook.com/mackerel.club' ,'icons-instagram.svg','https://www.instagram.com/mackerel.club','icons-soundcloud.svg' ,'https://soundcloud.com/mackerelclub' ,'icons-paypal.svg','https://www.paypal.com/paypalme/mackerelclub','Mackerel Club | mackerelclub.asso@gmail.com','Copyright © 2023 Mackerel Club');





INSERT INTO mackerelcmslike_db.test_entity (section,type ,code ,value) VALUES  ('header','titre',1,'Home'),
                                                                                ('header','bg',1,'bg-mack-fest.png'),
                                                                                ('header','titre',2,'Club'),
                                                                                ('header','bg',2,'club-bg-header.png' ),
                                                                                ('header','titre',3,'Event'),
                                                                                ('header','bg',3,'event-bg-header.jpg' ),
                                                                                ('header','titre',4,'Festival'),
                                                                                ('header','bg',4,'festival-bg-header.jpg' ),
                                                                                ('header','titre',5,'Artistes'),
                                                                                ('header','bg',5,'artiste-bg-header.png' ),
                                                                                ('header','titre',6,'Contact'),
                                                                                ('header','bg',6,'contact-bg-header.jpg'),
                                                                                ('header','btn',7,'LE FESTIVAL' ),
                                                                                ('header','btn',8,'BILLETERIE');

