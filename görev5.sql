SELECT Dept.Name AS DepartmentName, COUNT(Emp.Id) AS EmployeeCount
FROM Emp
JOIN Dept ON Emp.DeptId = Dept.Id
GROUP BY Dept.Name
ORDER BY Dept.Name;

--Elimizde 5 adet departman kaydı ve 10 adet çalışan kaydı olduğu için her departmanda en az 1 çalışan olduğunu varsayarsak sonuç tablomuzda 5 satır olur.
