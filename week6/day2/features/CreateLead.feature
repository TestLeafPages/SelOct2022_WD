Feature: CreateLead functionality of Leaftaps application

@Sanity
Scenario Outline: Create Lead with different data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on  Login button
Then HomePage should be displayed
Given Click CRMSFA link
And Click Leads Tab
And Click Create Lead Link
When Enter the company name as <companyName>
And Enter the first name as <firstName>
And Enter the last name as <lastName>
And Click on Create Lead Button
And Verify ViewLeads Page

Examples: 
|companyName|firstName|lastName|
|TestLeaf|Subraja|Subi|
|Qeagle|Vidhya|R|








