package com.cloudframe.app.move0.dto;

/**
*  The class Rl7abTableInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Rl7abTableInfo extends Rl7abTableInfoSerialized { 
   
			@Getter @Setter private List<Rl7abTbl> rl7abTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Rl7abTableInfo
	**/
    public Rl7abTableInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Rl7abTableInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl7abTableInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < RL_7AB_TBL_SIZE;arrayIndex++) {
						getRl7abTbl().add(new Rl7abTbl(this, beginRl7abTbl + 
						arrayIndex * Rl7abTbl.getRl7abTblFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < RL_7AB_TBL_SIZE;arrayIndex++) {
					getRl7abTbl().add(new Rl7abTbl(this, beginRl7abTbl + 
						arrayIndex * Rl7abTbl.getRl7abTblFieldLength()));
			}
    } 

	/**
	 * 	initializes Rl7abTableInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (rl7abTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  RL_7AB_TBL_SIZE;index++) {
              Rl7abTbl  newElement = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
              newElement.initialize();
              getRl7abTbl().add(newElement);
          }
     } else {
        if (rl7abTbl.size() < RL_7AB_TBL_SIZE) {
          // prefill it first
          for (int index = rl7abTbl.size();index <  RL_7AB_TBL_SIZE;index++) {
              Rl7abTbl  newElement = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
              getRl7abTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  RL_7AB_TBL_SIZE;index++) {
     		Rl7abTbl rl7abTblVar = rl7abTbl.get(index);
 			if (rl7abTblVar == null) {
                rl7abTblVar = new Rl7abTbl(this,beginRl7abTbl + index * Rl7abTbl.getRl7abTblFieldLength());
                  getRl7abTbl().set(index, rl7abTblVar);
			} 
			rl7abTblVar.initialize();
		}
     }
   }


}
  
