package com.test.processor;

import com.test.model.Customer;
import com.test.model.NewCustomer;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by owner on 2/20/2017.
 */
public class FilterCustomerProcessor implements ItemProcessor<Customer, NewCustomer> {

    @Override
    public NewCustomer process(Customer item) throws Exception {

        if(validate(item)) {
            return(transform(item));
        }
        else{
            return null;
        }
    }

    //setting validation rules - limitation to Pune customers only
    private boolean validate(Customer item) throws Exception {
        if(!item.getCity().equalsIgnoreCase("Pune")){
            return false;
        }
        else {
            return true;
        }
    }

    //transforming the model if validation is successful
    private NewCustomer transform(Customer item) throws Exception{
        NewCustomer newItem = new NewCustomer();
        newItem.setFirstName(item.getFirstName());
        newItem.setLastName(item.getLastName());
        return newItem;
    }

}
