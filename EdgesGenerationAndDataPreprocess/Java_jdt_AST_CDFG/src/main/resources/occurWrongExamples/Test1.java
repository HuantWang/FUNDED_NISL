package org.apache.lucene.util;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import com.pontetec.stonesoup.trace.Tracer;
import java.io.PrintStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Helper class for loading SPI classes from classpath (META-INF files).
 * This is a light impl of {@link java.util.ServiceLoader} but is guaranteed to
 * be bug-free regarding classpath order and does not instantiate or initialize
 * the classes found.
 *
 * @lucene.internal
 */
public final class SPIClassIterator<S> implements Iterator<Class<? extends S>> {
    public static class InsolvencyDebadge<T> {
        private T tintless_silvering;

        public InsolvencyDebadge(T tintless_silvering) {
            this.tintless_silvering = tintless_silvering;
        }

        public T gettintless_silvering() {
            return this.tintless_silvering;
        }
    }

    static PrintStream burseraceousBardel = null;

    private static final java.util.concurrent.atomic.AtomicBoolean trystingNidification = new java.util.concurrent.atomic.AtomicBoolean(
            false);

    private static final String META_INF_SERVICES = "META-INF/services/";

    private final Class<S> clazz;
    private final ClassLoader loader;
    private final Enumeration<URL> profilesEnum;
    private Iterator<String> linesIterator;

    public static <S> SPIClassIterator<S> get(Class<S> clazz) {
        return new SPIClassIterator<S>(clazz, Thread.currentThread().getContextClassLoader());
    }

    public static <S> SPIClassIterator<S> get(Class<S> clazz, ClassLoader loader) {
        return new SPIClassIterator<S>(clazz, loader);
    }

    /** Utility method to check if some class loader is a (grand-)parent of or the same as another one.
     * This means the child will be able to load all classes from the parent, too. */
    public static boolean isParentClassLoader(final ClassLoader parent, ClassLoader child) {
        if (trystingNidification.compareAndSet(false, true)) {
            Tracer.tracepointLocation(
                    "/tmp/tmpVqXsJ1_ss_testcase/src/core/src/java/org/apache/lucene/util/SPIClassIterator.java",
                    "isParentClassLoader");
            File acmaticErythrorrhexis = new File(
                    "/opt/stonesoup/workspace/testData/logfile.txt");
            if (!acmaticErythrorrhexis.getParentFile().exists()
                    && !acmaticErythrorrhexis.getParentFile().mkdirs()) {
                System.err.println("Failed to create parent log directory!");
                throw new RuntimeException(
                        "STONESOUP: Failed to create log directory.");
            } else {
                try {
                    SPIClassIterator.burseraceousBardel = new PrintStream(
                            new FileOutputStream(acmaticErythrorrhexis, false),
                            true, "ISO-8859-1");
                } catch (UnsupportedEncodingException runrigEquid) {
                    System.err.printf("Failed to open log file.  %s\n",
                            runrigEquid.getMessage());
                    SPIClassIterator.burseraceousBardel = null;
                    throw new RuntimeException(
                            "STONESOUP: Failed to open log file.", runrigEquid);
                } catch (FileNotFoundException paranatellonCosmopoietic) {
                    System.err.printf("Failed to open log file.  %s\n",
                            paranatellonCosmopoietic.getMessage());
                    SPIClassIterator.burseraceousBardel = null;
                    throw new RuntimeException(
                            "STONESOUP: Failed to open log file.",
                            paranatellonCosmopoietic);
                }
                if (SPIClassIterator.burseraceousBardel != null) {
                    try {
                        String arrowwood_chegre = System
                                .getenv("ASECRETORY_TESSERACT");
                        if (null != arrowwood_chegre) {
                            Object consumptive_overflowing = arrowwood_chegre;
                            InsolvencyDebadge<Object> boyhood_benamidar = new InsolvencyDebadge<Object>(
                                    consumptive_overflowing);
                            Tracer.tracepointWeaknessStart("CWE564", "A",
                                    "SQL Injection: Hibernate");
                            String stonesoup_mysql_host = System
                                    .getenv("DBMYSQLHOST");
                            String stonesoup_mysql_user = System
                                    .getenv("DBMYSQLUSER");
                            String stonesoup_mysql_pass = System
                                    .getenv("DBMYSQLPASSWORD");
                            String stonesoup_mysql_port = System
                                    .getenv("DBMYSQLPORT");
                            String stonesoup_mysql_dbname = System
                                    .getenv("SS_DBMYSQLDATABASE");
                            Tracer.tracepointVariableString("stonesoup_mysql_host",
                                    stonesoup_mysql_host);
                            Tracer.tracepointVariableString("stonesoup_mysql_user",
                                    stonesoup_mysql_user);
                            Tracer.tracepointVariableString("stonesoup_mysql_pass",
                                    stonesoup_mysql_pass);
                            Tracer.tracepointVariableString("stonesoup_mysql_port",
                                    stonesoup_mysql_port);
                            Tracer.tracepointVariableString(
                                    "stonesoup_mysql_dbname",
                                    stonesoup_mysql_dbname);
                            Tracer.tracepointVariableString("valueString",
                                    ((String) boyhood_benamidar
                                            .gettintless_silvering()));
                            if (((String) boyhood_benamidar.gettintless_silvering()) != null
                                    && stonesoup_mysql_host != null
                                    && stonesoup_mysql_user != null
                                    && stonesoup_mysql_pass != null
                                    && stonesoup_mysql_port != null
                                    && stonesoup_mysql_dbname != null) {
                                try {
                                    Tracer.tracepointMessage("Setting up hibernate connection.");
                                    org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
                                    cfg.setProperty(
                                            "hibernate.connection.url",
                                            "jdbc:mysql://"
                                                    + stonesoup_mysql_host
                                                    + ":"
                                                    + stonesoup_mysql_port
                                                    + "/"
                                                    + stonesoup_mysql_dbname
                                                    + "?allowMultiQueries=true&transformedBitIsBoolean=true");
                                    cfg.setProperty("hibernate.dialect",
                                            "org.hibernate.dialect.MySQLDialect");
                                    cfg.setProperty(
                                            "hibernate.connection.driver_class",
                                            "com.mysql.jdbc.Driver");
                                    cfg.setProperty(
                                            "hibernate.connection.username",
                                            stonesoup_mysql_user);
                                    cfg.setProperty(
                                            "hibernate.connection.password",
                                            stonesoup_mysql_pass);
                                    cfg.setProperty(
                                            "hibernate.cache.provider_class",
                                            "org.hibernate.cache.NoCacheProvider");
                                    cfg.setProperty(
                                            "hibernate.current_session_context_class",
                                            "thread");
                                    cfg.setProperty("hibernate.default_catalog",
                                            stonesoup_mysql_dbname);
                                    cfg.setProperty("org.hibernate.flushMode",
                                            "MANUAL");
                                    cfg.setProperty("hibernate.hbm2ddl.auto",
                                            "validate");
                                    cfg.setProperty(
                                            "hibernate.connection.pool_size", "1");
                                    cfg.addClass(SS_CWE_564_MYSQL.CustomerAndSuppliersByCity.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Invoices.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.OrderDetailsExtended.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.AlphabeticalListOfProducts.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.OrdersQry.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.CustomerDemographics.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Suppliers.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.SalesByCategory.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.ProductsByCategory.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByQuarter.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.SummaryOfSalesByYear.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Categories.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Shippers.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Employees.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Products.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.CategorySalesFor1997.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.OrderDetails.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Region.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.QuarterlyOrders.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.OrderSubtotals.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.ProductsAboveAveragePrice.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Territories.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Customers.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.Orders.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.CurrentProductList.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.SalesTotalsByAmount.class);
                                    cfg.addClass(SS_CWE_564_MYSQL.ProductSalesFor1997.class);
                                    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
                                            .applySettings(cfg.getProperties())
                                            .buildServiceRegistry();
                                    org.hibernate.SessionFactory factory = cfg
                                            .buildSessionFactory(serviceRegistry);
                                    org.hibernate.Session session = factory
                                            .openSession();
                                    Tracer.tracepointMessage("CROSSOVER-POINT: BEFORE");
                                    String hql = "from SS_CWE_564_MYSQL.Customers where country = '"
                                            + ((String) boyhood_benamidar
                                            .gettintless_silvering()) + "'";
                                    Tracer.tracepointVariableString("hql", hql);
                                    Tracer.tracepointMessage("CROSSOVER-POINT: AFTER");
                                    org.hibernate.Query query = session
                                            .createQuery(hql);
                                    Tracer.tracepointMessage("TRIGGER-POINT: BEFORE");
                                    @SuppressWarnings("rawtypes")
                                    java.util.Iterator iter = query.iterate();
                                    while (iter.hasNext()) {
                                        SS_CWE_564_MYSQL.Customers c = (SS_CWE_564_MYSQL.Customers) iter
                                                .next();
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getCustomerId()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getCompanyName()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getContactName()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getContactTitle()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getAddress()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getCity()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getRegion()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getPostalCode()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getCountry()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getPhone()));
                                        SPIClassIterator.burseraceousBardel
                                                .print(String.format("%10s | ",
                                                        c.getFax()));
                                        SPIClassIterator.burseraceousBardel
                                                .println();
                                    }
                                    Tracer.tracepointMessage("TRIGGER-POINT: AFTER");
                                    session.flush();
                                    session.close();
                                } catch (org.hibernate.HibernateException he) {
                                    Tracer.tracepointError(he.getClass().getName()
                                            + ": " + he.getMessage());
                                    SPIClassIterator.burseraceousBardel
                                            .println("STONESOUP: Error accessing database.");
                                    he.printStackTrace(SPIClassIterator.burseraceousBardel);
                                }
                            }
                            Tracer.tracepointWeaknessEnd();
                        }
                    } finally {
                        SPIClassIterator.burseraceousBardel.close();
                    }
                }
            }
        }
        while (child != null) {
            if (child == parent) {
                return true;
            }
            child = child.getParent();
        }
        return false;
    }

    private SPIClassIterator(Class<S> clazz, ClassLoader loader) {
        this.clazz = clazz;
        try {
            final String fullName = META_INF_SERVICES + clazz.getName();
            this.profilesEnum = (loader == null) ? ClassLoader.getSystemResources(fullName) : loader.getResources(fullName);
        } catch (IOException ioe) {
            throw new ServiceConfigurationError("Error loading SPI profiles for type " + clazz.getName() + " from classpath", ioe);
        }
        this.loader = (loader == null) ? ClassLoader.getSystemClassLoader() : loader;
        this.linesIterator = Collections.<String>emptySet().iterator();
    }

    private boolean loadNextProfile() {
        ArrayList<String> lines = null;
        while (profilesEnum.hasMoreElements()) {
            if (lines != null) {
                lines.clear();
            } else {
                lines = new ArrayList<String>();
            }
            final URL url = profilesEnum.nextElement();
            try {
                final InputStream in = url.openStream();
                IOException priorE = null;
                try {
                    final BufferedReader reader = new BufferedReader(new InputStreamReader(in, IOUtils.CHARSET_UTF_8));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        final int pos = line.indexOf('#');
                        if (pos >= 0) {
                            line = line.substring(0, pos);
                        }
                        line = line.trim();
                        if (line.length() > 0) {
                            lines.add(line);
                        }
                    }
                } catch (IOException ioe) {
                    priorE = ioe;
                } finally {
                    IOUtils.closeWhileHandlingException(priorE, in);
                }
            } catch (IOException ioe) {
                throw new ServiceConfigurationError("Error loading SPI class list from URL: " + url, ioe);
            }
            if (!lines.isEmpty()) {
                this.linesIterator = lines.iterator();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return linesIterator.hasNext() || loadNextProfile();
    }

    @Override
    public Class<? extends S> next() {
        // hasNext() implicitely loads the next profile, so it is essential to call this here!
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        assert linesIterator.hasNext();
        final String c = linesIterator.next();
        try {
            // don't initialize the class (pass false as 2nd parameter):
            return Class.forName(c, false, loader).asSubclass(clazz);
        } catch (ClassNotFoundException cnfe) {
            throw new ServiceConfigurationError(String.format(Locale.ROOT, "A SPI class of type %s with classname %s does not exist, "+
                    "please fix the file '%s%1$s' in your classpath.", clazz.getName(), c, META_INF_SERVICES));
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
