(function(){
 'use strict';

angular.module('myFirstApp',[])
  .controller('MyFirstController',function($scope){
    $scope.fNo=0;
    $scope.sNo=0;
    $scope.totalValue=0;
    $scope.displayNumeric = function(){
      var sum=calculateSum($scope.fNo,$scope.sNo);;
      $scope.totalValue=sum;
    };
    function calculateSum(fNumber,sNumber){
      var totalValue=0;
      totalValue=parseFloat(fNumber)+parseFloat(sNumber);
      return totalValue;
    }
  });

})();
