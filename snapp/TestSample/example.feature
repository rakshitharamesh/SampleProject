Feature: Costumer transfer fund
As a customer,
I want to transfer funds
So that I can send money to friends and family

Scenario: Valid payee
	Given the user is on the fund transfer page
	When he enters "Tim"  as payee name 
	And he enters "100" as amount
	And he submits request for fund transfer
	Then ensure that fund transfer is completed with "$100 transferred successfully to Jim!!" message
	 