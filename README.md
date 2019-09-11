# # SOP_smartshop API
**Method GET** : ```/restaurant/all```
for read all food

**Method GET** : ```/restaurant/read/{index}	```
for read food at index

**Method POST** : ```/restaurant/add```
Sent RequestParam String name ,RequestParam int price

**Method POST** : ```/restaurant/update/{index}```
Sent ```{'name':'foodname','price':num}```

**Method DELETE** : ```/restaurant/delete```
for delete all food

**Method DELETE** : ```/restaurant/delete/{index}```
for delete food at index
