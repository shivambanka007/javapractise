(function(){
 'use strict';

angular.module('myFirstApp',[])
  .controller('StringController',function($scope){
    $scope.evaluation="";
    $scope.splitString=function(){
    var inputString=$scope.stringInput;
    inputString=inputString.split(",");
    if(inputString.length >3){
      $scope.evaluation="Too much!";
    }
    else{
      $scope.evaluation="Enjoy!";
    }
    };
  });

})();
