DELETE FROM vehicles;

INSERT INTO vehicles (id, renavam, make, model, "year", is_older, active, plate, color, created_at) VALUES
(1, '06137235401', 'Fiat', 'UNO ATTRACTIVE 1.4 EVO Fire Flex 8V 2p', 2010, false, true, 'BBZ-2583', 'Prata', CURRENT_TIMESTAMP),
(2, '08305008248', 'Fiat', 'Palio Weekend Adv. Ext. 1.8 Flex', 2012, null, true, 'AAL-4224', 'Preto', CURRENT_TIMESTAMP),
(3, '47064285690', 'VW - VolksWagen', 'Kombi Escolar 1.6 MPi', 1999, false, true, 'BAH-3907', 'Branco', CURRENT_TIMESTAMP),
(4, '48091885633', 'VW - VolksWagen', 'Golf GTI 1.8 Turbo', 1998, null, true, 'ARB-8565', 'Preto', CURRENT_TIMESTAMP),
(5, '23116387091', 'VW - VolksWagen', 'VOYAGE I MOTION Evidence 1.6 T.Flex 8V', 2015, false, true, 'AEN-8183', 'Prata', CURRENT_TIMESTAMP),
(6, '15624119201', 'GM - Chevrolet', 'Cheynne 4.3 V6', 1993, false, true, 'AFR-3614', 'Branco', CURRENT_TIMESTAMP),
(7, '26197921683', 'GM - Chevrolet', 'Corsa Hatchback 1.8 MPFI 8V 102cv 5p', 2002, true, true, 'AOB-3128', 'Amarelo', CURRENT_TIMESTAMP),
(8, '05348386878', 'GM - Chevrolet', 'Kadett GLS 2.0 MPFI', 1992, true, true, 'AIX-6272', 'Prata', CURRENT_TIMESTAMP),
(9, '37153879415', 'Ford', 'Expedition 5.4 V8', 1997, true, true, 'AGM-3521', 'Verde', CURRENT_TIMESTAMP),
(10, '61202237623', 'Ford', 'Explorer Limited 5.0 4x4 V8', 1998, true, true, 'AAI-3635', 'Verde', CURRENT_TIMESTAMP);