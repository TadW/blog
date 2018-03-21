

INSERT INTO post (post_id, author, title, body, posted_on)
VALUES (1, 'JoeK', 'Lorem ipsum dolor sit amet ',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
        CURRENT_TIMESTAMP);
INSERT INTO post (post_id, author, title, body, posted_on)
VALUES (2, 'PaulW', 'Lorem ipsum dolor sit amet ',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
        CURRENT_TIMESTAMP);
INSERT INTO post (post_id, author, title, body, posted_on) VALUES (3, 'JasonA', 'Lorem ipsum dolor sit amet ',
                                                                   'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
                                                                   CURRENT_TIMESTAMP);



INSERT INTO users (user_id, email, password,full_name) VALUES
  (1, 'admin@admin', 'admin','ROLE_ADMIN');

INSERT INTO roles (role_id, role) VALUES
  (1, 'ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES
  (1,1);







