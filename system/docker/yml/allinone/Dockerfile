FROM fluentd:v1.9.1-debian-1.0

ENV TZ Asia/Seoul

USER root

RUN set -eux; \
    ln -snf /usr/share/zoneinfo/$TZ /etc/localtime; \
    echo ${TZ} > /etc/timezone; \
    gem install fluent-plugin-elasticsearch

RUN gem install fluent-plugin-kafka

ADD fluent.conf /fluentd/etc/

USER fluent
