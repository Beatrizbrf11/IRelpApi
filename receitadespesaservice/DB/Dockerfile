FROM mysql
ENV MYSQL_ROOT_PASSWORD R@@t2020
ARG SETUP_DATABASE=DBreceitaDespesa
ENV MYSQL_DATABASE=${SETUP_DATABASE}
ARG SETUP_REMOTE_USERNAME=remote
ARG SETUP_REMOTE_PASSWORD=R@@t2020
COPY ./create.sql /docker-entrypoint-initdb.d/create.sql