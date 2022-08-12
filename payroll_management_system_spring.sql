create schema payroll_management_system_spring;
use payroll_management_system_spring;
--

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `country_id` int(11) NOT NULL,
  `country_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`country_id`, `country_name`) VALUES
(1, 'Canada'),
(2, 'USA');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department_id` int(11) NOT NULL,
  `department_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department_id`, `department_name`) VALUES
(1, 'IT Department'),
(2, 'Java Developement'),
(3, 'HR Department'),
(4, 'Web Developement');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employee_id` int(11) NOT NULL,
  `employee_sal` varchar(100) NOT NULL,
  `employee_first_name` varchar(100) NOT NULL,
  `employee_middle_name` varchar(100) NOT NULL,
  `employee_last_name` varchar(100) NOT NULL,
  `employee_gender` varchar(100) NOT NULL,
  `employee_address` varchar(100) NOT NULL,
  `employee_city` varchar(100) NOT NULL,
  `employee_province` varchar(100) NOT NULL,
  `employee_country` varchar(100) NOT NULL,
  `employee_mobile` varchar(100) NOT NULL,
  `employee_email` varchar(100) NOT NULL,
  `employee_status` varchar(255) NOT NULL,
  `employee_department` varchar(255) NOT NULL,
  `employee_dob` varchar(255) NOT NULL,
  `employee_nationalty` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- ----------------------------
-- Dumping data for table employee

-- ------------------------------

INSERT INTO `employee` (`employee_id`, `employee_sal`, `employee_first_name`, `employee_middle_name`, `employee_last_name`
, `employee_gender`, `employee_address`, `employee_city`, `employee_province`, `employee_country`, `employee_mobile`
, `employee_email`, `employee_status`, `employee_department`, `employee_dob`, `employee_nationalty`) 
VALUES ('1', '20000', 'Khushbu', 'R', 'Somani', 'Female', 'abc drive', 'toronto', 'Ontario', 'Canada', '123456789', 
'somanikhushbu2@gmail.com', 'Developer', 'IT Developer', '2000-01-09', 'Indian');


create table `employee_login`(
`employee_email` varchar(100) NOT NULL,
`employee_password` varchar(100) NOT NULL);

INSERT into `employee_login` (`employee_email`,`employee_password`) VALUES ('jay@gmail.com','test');
--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(31);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `login_id` int(11) NOT NULL,
  `login_employee_id` varchar(255) NOT NULL,
  `login_email` varchar(255) NOT NULL,
  `login_password` varchar(255) NOT NULL,
  `login_level_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`login_id`, `login_employee_id`, `login_email`, `login_password`, `login_level_id`) VALUES
(1, '1001', 'amit@gmail.com', 'test', '1'),
(2, '1002', 'somanikhushbu2@gmail.com', '1234', '1'),
(3, '1003', 'jay@gmail.com', 'test', '1');
-- --------------------------------------------------------

--
-- Table structure for table `month`
--

CREATE TABLE `month` (
  `month_id` int(11) NOT NULL,
  `month_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `month`
--

INSERT INTO `month` (`month_id`, `month_name`) VALUES
(1, 'January'),
(2, 'February'),
(3, 'March'),
(4, 'April'),
(5, 'May'),
(6, 'June'),
(7, 'July'),
(8, 'August'),
(9, 'September'),
(10, 'October'),
(11, 'November'),
(12, 'December');

-- --------------------------------------------------------

--
-- Table structure for table `province`
--

CREATE TABLE `province` (
  `province_id` int(11) NOT NULL,
  `province_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `province`
--

INSERT INTO `province` (`province_id`, `province_name`) VALUES
(1, 'Ontario'),
(2, 'Manitoba'),
(3, 'British Columbia'),
(4, 'Alberta'),
(5, 'Calfornia'),
(6, 'New Jersey'),
(7, 'Quebec');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `salary_id` int(11) NOT NULL,
  `salary_employee_id` varchar(255) NOT NULL,
  `salary_month` varchar(255) NOT NULL,
  `salary_working_days` varchar(255) NOT NULL,
  `salary_basic` varchar(255) NOT NULL,
  `salary_dtax` varchar(255) NOT NULL,
  `salary_desc` text NOT NULL,
  `salary_total` varchar(255) NOT NULL,
  `salary_dedc` varchar(255) NOT NULL,
  `salary_ca` varchar(255) DEFAULT NULL,
  `salary_da` varchar(255) DEFAULT NULL,
  `salary_dpf` varchar(255) DEFAULT NULL,
  `salary_hra` varchar(255) DEFAULT NULL,
  `salary_mediclaim` varchar(255) DEFAULT NULL,
  `salary_others` varchar(255) DEFAULT NULL,
  `salary_reimbursement` varchar(255) DEFAULT NULL,
  `salary_ta` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`salary_id`, `salary_employee_id`, `salary_month`, `salary_working_days`, `salary_basic`, `salary_dtax`, `salary_desc`, `salary_total`, `salary_dedc`, `salary_ca`, `salary_da`, `salary_dpf`, `salary_hra`, `salary_mediclaim`, `salary_others`, `salary_reimbursement`, `salary_ta`) VALUES
(1, '1001', '1', '22', '20000', '2300', 'Salary for the ', '35900', '3500', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(2, '1002', '2', '22', '20000', '2300', 'Salary for the ', '35900', '3500', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, '1003', '3', '22', '20000', '2300', 'Salary for the ', '35900', '3500', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(28, '27', '8', '28', '20000', '90', 'August-22', '18000', '200', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(30, '29', '8', '28', '20000', '200', '3 sick leave', '18000', '200', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `saluation`
--

CREATE TABLE `saluation` (
  `saluation_id` int(11) NOT NULL,
  `saluation_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saluation`
--

INSERT INTO `saluation` (`saluation_id`, `saluation_name`) VALUES
(1, 'Mr.'),
(2, 'Mrs.'),
(3, 'Ms.');

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE `state` (
  `state_id` bigint(20) NOT NULL,
  `state_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`country_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`department_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employee_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`login_id`);

--
-- Indexes for table `month`
--
ALTER TABLE `month`
  ADD PRIMARY KEY (`month_id`);

--
-- Indexes for table `province`
--
ALTER TABLE `province`
  ADD PRIMARY KEY (`province_id`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`salary_id`);

--
-- Indexes for table `saluation`
--
ALTER TABLE `saluation`
  ADD PRIMARY KEY (`saluation_id`);

--
-- Indexes for table `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`state_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `country`
--
ALTER TABLE `country`
  MODIFY `country_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `department_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employee_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1016;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `login_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `month`
--
ALTER TABLE `month`
  MODIFY `month_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `province`
--
ALTER TABLE `province`
  MODIFY `province_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `salary`
--
ALTER TABLE `salary`
  MODIFY `salary_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `saluation`
--
ALTER TABLE `saluation`
  MODIFY `saluation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;
