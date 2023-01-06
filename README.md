# OOP E-Commerce Kata

**E-Commerce Application Project**

**OVERVIEW** 

A newly formed clothing company are launching their E-commerce website, create a Java application that represents the business logic highlighted in the below specification.

The focus of this task is on the following Software fundamentals: OOP, SOLID and DRY.

----------------------------------

**DETAILS**

As the company is newly formed it is restricted to the following:
-	 Item Types: T-shirts and Shoes
-	 Brands: Adidas, Nike, Reebok
-	 Colours: Red, Pink, Green

More information: 

- T-shirts can be either short or long sleeve.
- The Lace colour on shoes can be defined only once the shoes have been selected
- The price of each pair of shoes is 45.99 regardless of Brand/Colour
- The price of each T-Shirt is 18.99 regardless of Brand/Colour or Sleeve length
- Products can only be added to an Order one at a time

---------------------------------
The company currently only operates in the UK and Australia. 
Shipping costs for an order are based off the Country in the Customer’s address.
Shipping costs for each order are as follows:

UK: 
-	less than 3 items = £4.99
-	3 or more items = £9.99

Australia:
-	 less than 3 items = £14.99
-	 3 or more items = £19.99

Customer details required are: 
- Full name
- Address (house number, postcode and Country)

--------------------------------
**TASKS**
- Create the application based off the above criteria. Ensure to follow SOLID and OOP principles in your design.

- Write unit tests to simulate the creation of an order and pricing calculations. Ensure that the total order price (products + shipping) is as expected.
