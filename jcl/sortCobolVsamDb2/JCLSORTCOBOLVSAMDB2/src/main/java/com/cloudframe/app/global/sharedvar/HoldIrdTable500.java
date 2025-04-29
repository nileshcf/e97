package com.cloudframe.app.global.sharedvar;

/**
*  The class HoldIrdTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_holdIrdTable500")

@Data
public class HoldIrdTable500 extends HoldIrdTable500Serialized  implements InitializingBean {
   

								@Getter @Setter private short irdLdCnt500;

								@Getter @Setter private short irdLdCnt1500;
			@Getter @Setter private List<IrdTbl500> irdTbl500 = new ArrayList<>();
    	
	
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
						getIrdTbl500().add(new IrdTbl500(this, beginIrdTbl500 + 
						arrayIndex * IrdTbl500.getIrdTbl500FieldLength()));
				}
	   	/*  end of offset */
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
              getIrdTbl500().add(newElement);
          }
     } else {
        if (irdTbl500.size() < IRD_TBL_500_SIZE) {
          // prefill it first
          for (int index = irdTbl500.size();index <  IRD_TBL_500_SIZE;index++) {
              IrdTbl500  newElement = new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength());
              getIrdTbl500().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IRD_TBL_500_SIZE;index++) {
     		IrdTbl500 irdTbl500Var = irdTbl500.get(index);
 			if (irdTbl500Var == null) {
                irdTbl500Var = new IrdTbl500(this,beginIrdTbl500 + index * IrdTbl500.getIrdTbl500FieldLength());
                  getIrdTbl500().set(index, irdTbl500Var);
			} 
			irdTbl500Var.initialize();
		}
     }
   }


}
  
