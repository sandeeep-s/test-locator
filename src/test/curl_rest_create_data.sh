curl -v -X POST  -H "Content-Type:application/json" -d '{"name":"postedStore"}' http://localhost:8090/stores

curl -v -X POST  -H "Content-Type:application/json" -d '{"name":"postedSection", "store":"http://localhost:8090/stores/1"}' http://localhost:8090/sections

curl -v -X POST  -H "Content-Type:application/json" -d '{"name":"postedItem"}' http://localhost:8090/items

curl -v -X POST  -H "Content-Type:application/json" -d '{"name":"postedSection", "item":"http://localhost:8090/items/1","section":"http://localhost:8090/sections/1"}' http://localhost:8090/itemSections

curl -v -X PATCH  -H "Content-Type:application/json" -d '{"code":"postedItemCode"}' http://localhost:8090/items/1


#curl -v -X PATCH -H "Content-Type:application/patch+json" -d '[{"op":"add", "path":"/sections/0", "value":{"name":"S2"}}]' http://localhost:8090/stores/1
