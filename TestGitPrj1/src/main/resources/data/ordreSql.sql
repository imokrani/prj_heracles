-- Ajouter une colonne dans la table des users pour la gestion des roles.
-- Ajouter une commentaire dnas la branche EIC_BR2
ALTER TABLE users ADD COLUMN roles CHARACTER VARYING(255);