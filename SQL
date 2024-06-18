SELECT Dept.Name AS DepartmentName, COUNT(Emp.Id) AS EmployeeCount
FROM Emp
JOIN Dept ON Emp.DeptId = Dept.Id
GROUP BY Dept.Name
ORDER BY Dept.Name;
