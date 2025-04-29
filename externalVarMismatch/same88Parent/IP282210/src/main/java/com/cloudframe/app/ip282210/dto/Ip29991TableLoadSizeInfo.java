package com.cloudframe.app.ip282210.dto;

/**
*  The class Ip29991TableLoadSizeInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip29991TableLoadSizeInfo extends Ip29991TableLoadSizeInfoSerialized {
   

						@Getter @Setter private char[] ip29991LoadSearchPgm = Field.fillLowValue(8);


						@Getter @Setter private char[] ip29991TableId = Field.fillLowValue(8);


						@Getter @Setter private char[] ip29991FillerText = new char[21];

								@Getter @Setter private long ip29991TableRowsLoaded;

						@Getter @Setter private char[] ip29991FillerText01 = new char[20];

								@Getter @Setter private long ip29991TableRowOccurs;


						@Getter @Setter private char[] ip29991TableName = Field.fillLowValue(35);
	
	/**
	* Constructor for Ip29991TableLoadSizeInfo
	**/
    public Ip29991TableLoadSizeInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 17
             ,1
             );
								setIp29991FillerText((" :TABLE ROWS LOADED= ").toCharArray());
								setIp29991FillerText01((" :LOAD AREA OCCURS= ").toCharArray());
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 75
             ,2
             );
    }





}
  
