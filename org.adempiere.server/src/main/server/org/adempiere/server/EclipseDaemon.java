package org.adempiere.server;

public class EclipseDaemon
{
    @SuppressWarnings("restriction")
	public static void start ( final String[] args ) throws Exception {
    	org.eclipse.core.runtime.adaptor.EclipseStarter.main ( args );
    }
    @SuppressWarnings("restriction")
	public static void stop ( final String[] args ) throws Exception {
        org.eclipse.core.runtime.adaptor.EclipseStarter.shutdown();
    }
}