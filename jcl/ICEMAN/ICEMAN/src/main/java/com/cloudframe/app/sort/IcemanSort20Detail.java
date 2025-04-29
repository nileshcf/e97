package com.cloudframe.app.sort;

import java.io.File;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.concurrent.ExecutorService;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.List;	
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import com.cloudframe.app.utility.SpringContextHandler;
import com.cloudframe.app.sort.file.records.IcemanSort20Keys;
import com.cloudframe.app.data.Field;

@Component("batch_icemansort20")
@JobScope
public class IcemanSort20Detail {

	private List<IcemanSort20Keys> sortRecKeys = null;
	private Set<IcemanSort20Keys> setRecKeys = null;

	protected Field field = new Field();
	private Comparator<IcemanSort20Keys> sortComp = null;
	private AtomicInteger writeCounter = null;
	private RandomAccessFile raFile = null;
	private File tmpFile = null;
	private ExecutorService executorService = null;
	private String tempFileVal = "no";
	private int recInCounter = 0;

	public int getRecInCounter() {
		return recInCounter;
	}

	public void setRecInCounter(int recInCounter) {
		this.recInCounter = recInCounter;
	}
	
	public String getTempFileVal() {
		return tempFileVal;
	}
	
	public void setTempFileVal(String keyVal) {
		this.tempFileVal = keyVal;
	}
	
	public String useTempFile(boolean flag) {
	   if(flag) {
           setTempFileVal("yes");
       }
	   return this.tempFileVal;
    }
  
	public void setWriteCounter(AtomicInteger writeCounter) {
		this.writeCounter = writeCounter;
	}

	public AtomicInteger getWriteCounter() {
		return this.writeCounter;
	}

	/**
	 * @return the sortRecKeys
	 */
	public List<IcemanSort20Keys> getSortRecKeys() {
		return sortRecKeys;
	}

	/**
	 * @param sortRecKeys the sortRecKeys to set
	 */
	public void setSortRecKeys(List<IcemanSort20Keys> sortRecKeys) {
		this.sortRecKeys = sortRecKeys;
	}
	
	/**
	 * @return the sortRecKeys
	 */
	public Set<IcemanSort20Keys> getSortDistRecKeys() {
		return setRecKeys;
	}

	/**
	 * @param sortRecKeys the sortRecKeys to set
	 */
	public void setSortDistRecKeys(Set<IcemanSort20Keys> sortRecKeys) {
		this.setRecKeys = sortRecKeys;
	}
	/**
	 * @return the sortComp
	 */
	public Comparator<IcemanSort20Keys> getSortComp() {
		return sortComp;
	}

	/**
	 * @param sortComp the sortComp to set
	 */
	public void setSortComp(Comparator<IcemanSort20Keys> sortComp) {
		this.sortComp = sortComp;
	}

	public void setSortFile(RandomAccessFile raFile) {
		this.raFile = raFile;
	}

	public RandomAccessFile getRaFile() {
		return this.raFile;
	}
	
	public void setTempFile(File tmpFile) {
		this.tmpFile = tmpFile;
	}
	
	public File getTempFile() {
		return this.tmpFile;
	}
	
	public void setExecutorService(ExecutorService executor) {
		this.executorService = executor;
	}
	
	public ExecutorService getExecutorService() {
		return this.executorService;
	}
	

	public String getPropKeyValue(String keyName, int num, boolean hasMoreFiles) {
		if (hasMoreFiles)
			keyName += "[" + num + "]";
		return SpringContextHandler.getValue(keyName);
	}
}
