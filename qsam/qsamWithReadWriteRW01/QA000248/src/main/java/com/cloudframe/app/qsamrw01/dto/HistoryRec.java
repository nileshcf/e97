package com.cloudframe.app.qsamrw01.dto;

/**
*  The class HistoryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class HistoryRec extends HistoryRecSerialized {
   

      private List<char[]> historyRows; 

	
	/**
	* Constructor for HistoryRec
	**/
    public HistoryRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("HISTORY RECORD ->   ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
    }



	/**
	 * 	initializes HistoryRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < HISTORY_ROWS_SIZE;index++) {
             setHistoryRows(index, CONSTANTS.SPACE_20);
         }
   }


}
  
