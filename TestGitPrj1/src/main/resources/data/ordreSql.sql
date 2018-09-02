-- Ajouter une colonne dans la table des users pour la gestion des roles.
-- Ajouter une commentaire dnas les deux branches EIC_BR1 et 2
ALTER TABLE users ADD COLUMN roles CHARACTER VARYING(255);