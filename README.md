# Common Cucumber Feature Using

This project is an example how to use common features with different step definitions.

There are 2 implementations.

## Common features in different modules

The module `CommonFeatures` contain feature files. 

The `PrimaryStepDefinitions` and `SecondaryStepDefinitions` contains different step definitions.

### How to run from gradle

```
cd PrimaryStepDefinitions
gradle cucumber -DcucumberTags='@primaryDefault and not @test'
``` 

## All step definitions in one project

The module `CommonFeaturesInSingleModule` describe feature files and define steps in the different glue paths.

### How to run from gradle

```
cd CommonFeaturesInSingleModule
gradle cucumberPrimary -DcucumberTags='@primaryDefault and not @test'
``` 
