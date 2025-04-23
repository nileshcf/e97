package com.cloudframe.app.global.sharedvar;

/**
*  The class HoldIrdTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:58. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_holdIrdTable500")

public class HoldIrdTable500 extends HoldIrdTable500Serialized  implements InitializingBean {
   

								private short irdLdCnt500;

								private short irdLdCnt1500;
			private List<IrdTbl500> irdTbl500 = new ArrayList<>();
    	
	
	/**
	* Constructor for HoldIrdTable500
	**/
    public HoldIrdTable500() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IRD_TBL_500_SIZE;arrayIndex++) {
						irdTbl500.add(new IrdTbl500(this, beginIrdTbl500 + 
						arrayIndex * IrdTbl500.getIrdTbl500FieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of irdLdCnt500
	 *	@return irdLdCnt500
	 */
	public short getIrdLdCnt500() throws CFException {
        if (isIrdLdCnt500Modified()) { 
           irdLdCnt500 = refreshIrdLdCnt500();
        }
   		return irdLdCnt500;
	}
	
	/**
	 * 	Update IrdLdCnt500 with the passed value
	 *  Corresponding COBOL Variable is 500-IRD-LD-CNT
	 *	@param number
	 */
	public void setIrdLdCnt500(short number) {
	     // Truncate if the number is beyond +/- Max range
	    irdLdCnt500 = checkIrdLdCnt500MaxLimit(number); 
		serializeIrdLdCnt500(irdLdCnt500);
	}

	public void setIrdLdCnt500(int number) {
	    number = checkIrdLdCnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIrdLdCnt500((short)number);
	}
	public void setIrdLdCnt500(long number) {
	    number = checkIrdLdCnt500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIrdLdCnt500((short)number);
	}
	

	/**
	 *	Returns the value of irdLdCnt1500
	 *	@return irdLdCnt1500
	 */
	public short getIrdLdCnt1500() throws CFException {
        if (isIrdLdCnt1500Modified()) { 
           irdLdCnt1500 = refreshIrdLdCnt1500();
        }
   		return irdLdCnt1500;
	}
	
	/**
	 * 	Update IrdLdCnt1500 with the passed value
	 *  Corresponding COBOL Variable is 500-IRD-LD-CNT1
	 *	@param number
	 */
	public void setIrdLdCnt1500(short number) {
	     // Truncate if the number is beyond +/- Max range
	    irdLdCnt1500 = checkIrdLdCnt1500MaxLimit(number); 
		serializeIrdLdCnt1500(irdLdCnt1500);
	}

	public void setIrdLdCnt1500(int number) {
	    number = checkIrdLdCnt1500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIrdLdCnt1500((short)number);
	}
	public void setIrdLdCnt1500(long number) {
	    number = checkIrdLdCnt1500MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIrdLdCnt1500((short)number);
	}
	

	/**
	 *	Returns the  value of irdTbl500
	 *  Corresponding COBOL Variable is 500-IRD-TBL
	 *	@return irdTbl500
	 */
   public List<IrdTbl500> getIrdTbl500() {
       return irdTbl500;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return irdTbl500
	 */
	public IrdTbl500 getIrdTbl500(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIrdTbl500(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IRD_TBL_500_SIZE) {
             	index = IRD_TBL_500_SIZE -1; // can't exceed max array size
             	logger.trace("irdTbl500 - Array index exceeded max Size {}, resetting it to max allowed",IRD_TBL_500_SIZE); 
	    }
		if (index >= irdTbl500.size()) {
       		for (int fillIndex =  irdTbl500.size() -1; fillIndex < index;fillIndex++) {
		       irdTbl500.add(null);
		    }
			irdTbl500.set(index,
			   	   	new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength()) 
				                        ); 	
		} 
   	   IrdTbl500 value = irdTbl500.get(index);
   	   if (value == null) {
   	      irdTbl500.set(index,
			   	   	new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength()) 
				                        ); 
		  value = irdTbl500.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update IrdTbl500 at index with the passed value
	 *  Corresponding COBOL Variable is 500-IRD-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIrdTbl500(int index,char[] value) {
   	getIrdTbl500(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes HoldIrdTable500
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIrdLdCnt500((short)0);
         	setIrdLdCnt1500((short)0);
     if (irdTbl500.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IRD_TBL_500_SIZE;index++) {
              IrdTbl500  newElement = new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength());
              newElement.initialize();
               irdTbl500.add(newElement);
          }
     } else {
        if (irdTbl500.size() < IRD_TBL_500_SIZE) {
          // prefill it first
          for (int index = irdTbl500.size();index <  IRD_TBL_500_SIZE;index++) {
              IrdTbl500  newElement = new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength());
               irdTbl500.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IRD_TBL_500_SIZE;index++) {
     		IrdTbl500 irdTbl500Var = irdTbl500.get(index);
 			if (irdTbl500Var == null) {
                irdTbl500Var = new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength());
                  irdTbl500.set(index, irdTbl500Var);
			} 
			irdTbl500Var.initialize();
		}
     }
   }

		public static int getHoldIrdTable500FieldLength() {
			return HOLD_IRD_TABLE_500_LENGTH;
		}

}
  
