package Section_8.CE45_Banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        return branches.add(new Branch(name));
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) return false;
        return findBranch(branchName).newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) return false;
        return findBranch(branchName).addCustomerTransaction(customerName, transaction);
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean showTransaction) {
        if (findBranch(name) == null) {
            return false;
        }
        System.out.println("Customer details for branch " + name);
        Branch branch = findBranch(name);
        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
            if (showTransaction) {
                System.out.println("Transactions");
                for (int j = 0; j < customer.getTransactions().size(); j++) {
                    double transaction = customer.getTransactions().get(j);
                    System.out.println("[" + (j + 1) + "]" + "  Amount " + transaction);
                }
            }


        }
        return true;
    }

}
