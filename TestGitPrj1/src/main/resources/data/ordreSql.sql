-- Ajouter une colonne dans la table des users pour la gestion des roles.
ALTER TABLE users ADD COLUMN roles CHARACTER VARYING(255);