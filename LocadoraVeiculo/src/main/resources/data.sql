-- Fabricantes
INSERT INTO fabricante (id_fabricante, nome) VALUES
('c7b79db4-b3a7-43c4-b449-32db5246fd85', 'Toyota'),
('f0ffec0a-37a1-4bc0-b66c-167a249d4575', 'Ford');

-- Modelos de Carro
INSERT INTO modelo_carro (id_modelo, categoria, descricao, fabricante_id_fabricante) VALUES
('b0f19e2b-9a1a-4f0a-aef4-9e9f1b81c43c', 'SEDAN_GRANDE', 'Corolla', 'c7b79db4-b3a7-43c4-b449-32db5246fd85'),
('22c9af6c-3735-4b29-a1a4-509a50eac1f6', 'UTILITARIO_COMERCIAL', 'Hilux', 'c7b79db4-b3a7-43c4-b449-32db5246fd85'),
('908ea147-fec9-4c1e-878a-162a6ef49fa5', 'HATCH_COMPLETO', 'Fiesta', 'f0ffec0a-37a1-4bc0-b66c-167a249d4575');

-- Acessórios
INSERT INTO acessorio (id_acessorio, descricao) VALUES
('3f2d3c88-8c94-4c86-a7f9-9c189cdf51fc', 'Ar Condicionado'),
('bfb59708-2125-4a2b-9680-8dc40309ea70', 'Direção Hidráulica'),
('12b7ad0e-7dc3-45c2-99d4-60fc9cd5413c', 'Som Bluetooth');

-- Carros
INSERT INTO carro (id_carro, placa, chassi, cor, valor_diaria, modelo_carro_id_modelo) VALUES
('905b2f9f-2268-456e-882a-3526eab6952d', 'ABC1A23', 'CHASSI12345678901', 'Prata', 150.00, 'b0f19e2b-9a1a-4f0a-aef4-9e9f1b81c43c'),
('a82e3c72-b9e6-4d60-b64b-4478a52c7482', 'DEF4B56', 'CHASSI98765432109', 'Preto', 200.00, '22c9af6c-3735-4b29-a1a4-509a50eac1f6'),
('e58cc9d1-9e3b-4a1b-9a41-62766024644e', 'GHI7C89', 'CHASSI11121314151', 'Vermelho', 120.00, '908ea147-fec9-4c1e-878a-162a6ef49fa5');

-- Relação Carro-Acessório (carro_acessorio)
INSERT INTO carro_acessorio (id_carro, id_acessorio) VALUES
('905b2f9f-2268-456e-882a-3526eab6952d', '3f2d3c88-8c94-4c86-a7f9-9c189cdf51fc'),
('905b2f9f-2268-456e-882a-3526eab6952d', 'bfb59708-2125-4a2b-9680-8dc40309ea70'),

('a82e3c72-b9e6-4d60-b64b-4478a52c7482', '3f2d3c88-8c94-4c86-a7f9-9c189cdf51fc'),
('a82e3c72-b9e6-4d60-b64b-4478a52c7482', 'bfb59708-2125-4a2b-9680-8dc40309ea70'),
('a82e3c72-b9e6-4d60-b64b-4478a52c7482', '12b7ad0e-7dc3-45c2-99d4-60fc9cd5413c'),

('e58cc9d1-9e3b-4a1b-9a41-62766024644e', '3f2d3c88-8c94-4c86-a7f9-9c189cdf51fc');
