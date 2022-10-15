--Select
--ANSI
Select * from Customers 

Select ContactName,CompanyName,City from Customers
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
select * from Products where CategoryID=1 or CategoryID=3
select * from Products where CategoryID=1 and UnitPrice>=10

select * from Products order by UnitPrice asc --ascending(default halide asc)
select * from Products order by UnitPrice desc --descending
select * from Products where CategoryID=1 order by UnitPrice desc 

select count(*) from Products --total ürün sayısı
select count(*) Adet from Products where CategoryID=2

select CategoryID,count (*) from products group by CategoryID --hangi kategoride kaç ürün var
select CategoryID,count (*) from products group by CategoryID having count (*)<10 -- içinde 10 dan az ürün olan kategoriler
select CategoryID,count (*) from products where UnitPrice>20 group by CategoryID having count (*)<10 -- içinde 10 dan az ürün olan kategoriler

select * from Products inner join Categories on Products.CategoryID=Categories.CategoryID

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID

select Products.ProductID,Products.ProductName,Products.UnitPrice,Categories.CategoryName from Products inner join Categories on Products.CategoryID=Categories.CategoryID where Products.UnitPrice>10
-- inner join iki tabloda da eşleşenleri getirir,eşleşmeyenleri getirmez

select * from Products p left join [Order Details] od on p.ProductID=od.ProductID --yazılışa göre solda olup sağda olmayanları getir,satış olmayan ürünler
inner join Orders on o.OrderID=od.OrderID

select * from Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null  













