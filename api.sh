#!/bin/bash

# echo "2.3.2"
# curl http://localhost:8080/api/customers/ -w "\n"
# echo "GET"
# curl http://localhost:8080/api/customers/1 -i -XGET -w "\n"
# echo "POST: Tamako"
# curl http://localhost:8080/api/customers/ -i -XPOST -H "Content-Type: application/JSON" -d '{"firstName":"Tamako","lastName":"Nobi"}' -w "\n"
# echo "Tamako check"
# curl http://localhost:8080/api/customers/ -w "\n"
# echo "PUT: Nobita->Nobio"
# curl http://localhost:8080/api/customers/1 -i -XPUT -H "Content-Type: application/JSON" -d '{"firstName":"Nobio","lastName":"Nobi"}' -w "\n"
# echo "Nobio check"
# curl http://localhost:8080/api/customers/1 -w "\n"
# echo "DELETE: Nobio"
# curl http://localhost:8080/api/customers/1 -i -XDELETE -w "\n"
# echo "Nobio check"
# curl http://localhost:8080/api/customers/1 -w "\n"

# echo "2.3.3"
# curl http://localhost:8080/api/customers/ -i -XGET -w "\n"
# echo "pageing"
# curl 'http://localhost:8080/api/customers/?page=0&size=3' -i -XGET -w "\n" | jq -r -R 'fromjson?'
# curl 'http://localhost:8080/api/customers/?page=1&size=2' -i -XGET -w "\n" | jq -r -R 'fromjson?'