package com.cloudframe.app.ip798030.dto;

/**
*  The class Ip28221PaTableRestart is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class Ip28221PaTableRestart extends Ip28221PaTableRestartSerialized {
   

								@Getter @Setter private short ip28221PaTableLength;

						@Getter @Setter private char[] ip28221Restart = Field.fillLowValue(1);
			@Getter @Setter private List<Ip28221RestartTable> ip28221RestartTable = new ArrayList<>();
    	

						@Getter @Setter private char[] ip28221Filler = Field.fillLowValue(39);
	
	/**
	* Constructor for Ip28221PaTableRestart
	**/
    public Ip28221PaTableRestart() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_28221_RESTART_TABLE_SIZE;arrayIndex++) {
						getIp28221RestartTable().add(new Ip28221RestartTable(this, beginIp28221RestartTable + 
						arrayIndex * Ip28221RestartTable.getIp28221RestartTableFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
