# G2S4_AzulCrm
` Dear SDETs, for group project git-GitHub collaboration:` 

1. You need to clone a new project from Version Control using the link that is shared by the project
owner/git master,

2. Before start writing your codes, you should create your own branch following our common
naming convention as follows;
Name_USNumber / Hasan_US1537

**3.** While your head is on your own branch, you should right-click on your local Master branch and
select the option “Merge into Current” in order to update your own branch, (No need for this
step if you first created your own branch just before this step)

**4.** Create your feature file with its User Story name e.g.
Name_USNumber_USName / Hasan_US1537_QuickNavigateTask
Create your step defs class with its User Story name e.g.
Name_USNumber_USName / Hasan_US1537_QuickNavigateTask
Create your page class with its User Story name e.g.
Name_USNumber_USNamePage / Hasan_US1537_QuickNavigateTaskPage

**5-** Do not forget to use Login steps which is already created by GitMaster as your Background
in your own Feature file
Background: log in page feature
Given users log in with valid credentials as a "hr"
                                               "marketing"
                                               "helpdesk"

**6.** You should commit codes after you are done with your recent changes on your own branch,

**7.** Update your local master again and select “Merge into Current” to handle possible merge
conflicts on your local first before pushing your codes,

**8.** Push your branch to remote,

**9.** You should create a pull request on GitHub,

**10.** You should add your review-mate as a reviewer, then inform him/her about your pull request,

**11.** Your reviewer will check it and then will comment, approve and merge your commit to the
remote master,
If you encounter a merge conflict, please try to handle it by coordinating with Git Master
After the merge is completed successfully, you can delete the branch on Github.

**12.** Next day, you should update your local master branch and select “Merge into Current”
before starting to work on your feature,

**13.** Finally you can continue your work from Step 6.



>**Pages Name**	
>
    ==> Name_USNumber_USNamePage
    ==> Hasan_US1537_QuickNavigateTaskPage


>**Step Definitions Name**
>
    ==> Name_USNumber_USName
    ==> Hasan_US1537_QuickNavigateTask
    
    
>**Features Name** 
>
    ==> Name_USNumber_USName
    ==> Hasan_US1537_QuickNavigateTask


>**Pre-Conditions (Login)**
>
    Background: log in page feature
    Given users log in with valid credentials as a "hr"  
    
    "hr"    
    "marketing"
    "helpdesk"


>**configuration.properties**
>
    browser=chrome
    web.url=https://qa.azulcrm.com/

    hr.username=hr1@cybertekschool.com
    hr.password=UserUser

    marketing.username=marketing99@cybertekschool.com
    marketing.password=UserUser

    helpdesk.username=helpdesk1@cybertekschool.com
    helpdesk.password=User


>**CukesRunner**
>
    dryRun = false,
    tags = "@wip",


>**Feature File**
>
Do not use @wip in your feature file while pushing the codes.
Because if you send your "feature file" with @wip, your test
cases will run with other people's files and if they want to
delete it from your file, it will cause conflict.


>**Git Local Branch Name**
>
    ==> Name_USNumber
    ==> ***Hasan_US1537***


>**Commit Name**
>
    ==> Name_USNumber_CommitName
    ==> ***Hasan_US1537_TC01 Done***

[GitHub Pages](https://github.com/hsnakd/G2S4_AzulCrm)

![This is an image](https://github.com/hsnakd/G2S4_AzulCrm/blob/master/CYDEO.png)

![This is an image](https://myoctocat.com/assets/images/base-octocat.svg)
